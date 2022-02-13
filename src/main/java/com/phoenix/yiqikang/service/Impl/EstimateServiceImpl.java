package com.phoenix.yiqikang.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.phoenix.yiqikang.common.CommonConstants;
import com.phoenix.yiqikang.common.Page;
import com.phoenix.yiqikang.controller.response.EstimateResponse;
import com.phoenix.yiqikang.dto.BriefLesson;
import com.phoenix.yiqikang.dto.EstimateType;
import com.phoenix.yiqikang.dto.Visualization;
import com.phoenix.yiqikang.entity.*;
import com.phoenix.yiqikang.mapper.*;
import com.phoenix.yiqikang.service.EstimateService;
import com.phoenix.yiqikang.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstimateServiceImpl implements EstimateService {

    @Autowired
    private EstimateMapper estimateMapper;

    @Autowired
    private EstimateQuestionMapper estimateQuestionMapper;

    @Autowired
    private LessonMapper lessonMapper;

    @Autowired
    private RecommendLessonMapper recommendLectureMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<EstimateQuestion> getEstimateQuestionList() {
        return estimateQuestionMapper.selectAll();
    }

    @Override
    public EstimateResponse submitEstimate(Long userId, String answer) {
        Integer version = userMapper.selectByPrimaryKey(userId).getEstimateTimes()+1;
        userMapper.estimate(version,userId);
        String time = TimeUtil.getCurrentTimestamp();
        Long estimateId = (long)estimateMapper.insert(
                Estimate.builder()
                        .userId(userId)
                        .answer(answer)
                        .time(time)
                        .build());
        ArrayList<EstimateType> estimateTypeArrayList = new ArrayList<>();
        for(String ele: CommonConstants.ESTIMATE_TYPE_NAME_SCORE_LIST.keySet()){
            estimateTypeArrayList.add(EstimateType.builder().name(ele).scores(CommonConstants.ESTIMATE_TYPE_NAME_SCORE_LIST.get(ele)).build());
        }
        for(int i=0;i<58;i++){
            if(answer.charAt(i)=='0'){
                EstimateQuestion estimateQuestion = estimateQuestionMapper.selectByPrimaryKey(i+1);
                for(EstimateType ele:estimateTypeArrayList){
                    if(ele.getName().equals(estimateQuestion.getFirstPath())||ele.getName().equals(estimateQuestion.getSecondPath())){
                        int scores = ele.getScores();
                        ele.setScores(scores-1);
                        String suggestion = ele.getSuggestions();
                        ele.setSuggestions(suggestion+'\n'+estimateQuestion.getResolution());
                        List<BriefLesson> lectureList = ele.getLessonList();
                        BriefLesson briefLesson = lessonMapper.getLessonByName(estimateQuestion.getLessonName());
                        lectureList.add(briefLesson);
                        ele.setLessonList(lectureList);
                        recommendLectureMapper.insert(
                                RecommendLesson
                                        .builder()
                                        .userId(userId)
                                        .estimateId(estimateId)
                                        .version(version)
                                        .lectureId(briefLesson.getId())
                                        .build()
                        );
                    }
                }
            }
        }
        return new EstimateResponse(estimateId,estimateTypeArrayList);
    }

    @Override
    public Page<Estimate> getEstimateList(int pageNum, int pageSize, Long userId) {
        PageHelper.startPage(pageNum,pageSize,"time desc");
        return new Page(new PageInfo<>(estimateQuestionMapper.selectAll()));
    }

    @Override
    public EstimateResponse getEstimateResult(Long estimateId) {
        Estimate estimate = estimateMapper.selectByPrimaryKey(estimateId);
        ArrayList<EstimateType> estimateTypeArrayList = new ArrayList<>();
        for(String ele: CommonConstants.ESTIMATE_TYPE_NAME_SCORE_LIST.keySet()){
            estimateTypeArrayList.add(EstimateType.builder().name(ele).scores(CommonConstants.ESTIMATE_TYPE_NAME_SCORE_LIST.get(ele)).build());
        }
        for(int i=0;i<58;i++){
            if(estimate.getAnswer().charAt(i)=='0'){
                EstimateQuestion estimateQuestion = estimateQuestionMapper.selectByPrimaryKey(i+1);
                for(EstimateType ele:estimateTypeArrayList){
                    if(ele.getName().equals(estimateQuestion.getFirstPath())||ele.getName().equals(estimateQuestion.getSecondPath())){
                        int scores = ele.getScores();
                        ele.setScores(scores-1);
                        String suggestion = ele.getSuggestions();
                        ele.setSuggestions(suggestion+'\n'+estimateQuestion.getResolution());
                        List<BriefLesson> lectureList = ele.getLessonList();
                        BriefLesson briefLesson = lessonMapper.getLessonByName(estimateQuestion.getLessonName());
                        lectureList.add(briefLesson);
                        ele.setLessonList(lectureList);
                    }
                }
            }
        }
        return new EstimateResponse(estimateId,estimateTypeArrayList);
    }

    @Override
    public ArrayList<ArrayList<Visualization>> visualize(Long userId) {
        List<Estimate> estimateList = estimateMapper.getEstimateByUserId(userId);
        ArrayList<ArrayList<Visualization>> arrayLists = new ArrayList<>();
        ArrayList<Visualization> socialList  = new ArrayList<>();
        for(Estimate estimate:estimateList) socialList.add(new Visualization("社交行为",estimate.getTime(),0));
        arrayLists.add(socialList);
        ArrayList<Visualization> attentionList  = new ArrayList<>();
        for(Estimate estimate:estimateList) attentionList.add(new Visualization("注意力",estimate.getTime(),0));
        arrayLists.add(attentionList);
        ArrayList<Visualization> actionList  = new ArrayList<>();
        for(Estimate estimate:estimateList) actionList.add(new Visualization("执行功能",estimate.getTime(),0));
        arrayLists.add(actionList);
        for(Estimate estimate:estimateList){
            for(int i=0;i<58;i++) {
                if (estimate.getAnswer().charAt(i) == '1') {
                    EstimateQuestion estimateQuestion = estimateQuestionMapper.selectByPrimaryKey(i + 1);
                    for(ArrayList<Visualization> visualizationArrayList:arrayLists){
                        if(visualizationArrayList.get(0).getType().equals(estimateQuestion.getFirstPath())){
                            for(Visualization visualization:visualizationArrayList){
                                if(visualization.getTime().equals(estimate.getTime())){
                                    int scores = visualization.getScores();
                                    visualization.setScores(scores);
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayLists;
    }


}
