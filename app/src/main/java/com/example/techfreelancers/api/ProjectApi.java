package com.example.techfreelancers.api;

import com.example.techfreelancers.api.model.TechProject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ProjectApi {

    /**
     * Query recommend projects
     * @return
     */
    @GET("/tech/project/recommend")
    Call<ResponseModel<List<TechProject>>> queryRecommendProject();

    /**
     * Query my posted projects
     * @return
     */
    @GET("/tech/project/myposted")
    Call<ResponseModel<List<TechProject>>> queryMyPostedProject();

    /**
     * Query my accept projects
     * @return
     */
    @GET("/tech/project/myaccepted")
    Call<ResponseModel<List<TechProject>>> queryMyAcceptedProject();

    /**
     * Query recommend projects
     * @return
     */
    @GET("/tech/project/mostvote")
    Call<ResponseModel<List<TechProject>>> queryMostvotedProject();

    /**
     *
     * @param techProject
     * @return
     */
    @POST("/tech/project/save")
    Call<ResponseModel<Integer>> saveTechProject(@Body TechProject techProject);

    /**
     * query project by id
     * @param projectId
     * @return
     */
    @GET("/tech/project/id")
    Call<ResponseModel<TechProject>> queryProjectById(@Query("projectId") Integer projectId);

    /**
     * accept project
     * @param projectId
     * @return
     */
    @GET("/tech/project/accept")
    Call<ResponseModel> acceptProject(@Query("projectId") Integer projectId);

    /**
     * submit project
     * @param projectId
     * @return
     */
    @GET("/tech/project/submit")
    Call<ResponseModel> submitProject(@Query("projectId") Integer projectId);

    /**
     * check project
     * @param projectId
     * @return
     */
    @GET("/tech/project/check")
    Call<ResponseModel> checkProject(@Query("projectId") Integer projectId);

    /**
     * accept project
     * @param projectId
     * @return
     */
    @GET("/tech/project/vote")
    Call<ResponseModel> voteProject(@Query("projectId") Integer projectId, @Query("voteType") Integer voteType);
}
