package com.demo.projectmvp.api;


import com.demo.projectmvp.pojo.EmployeeResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET("testTask.json")
        // Получаем Observable для того, чтобы при получении данных,
        // мы знали результат выполнения этого метода (данные получены или исключение)
        // Реализуется в EmployeeListPresenter
    Observable<EmployeeResponse> getEmployees();
}