package com.imu.paper.controller;


import com.imu.paper.entity.ServiceRequest;
import com.imu.paper.entity.ServiceResponse;
import com.imu.paper.service.UserService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ServiceResponse login(@RequestBody ServiceRequest serviceRequest){
        return new ServiceResponse<>(userService.login(serviceRequest));
    }

    @PostMapping("/register")
    public ServiceResponse register(@RequestBody ServiceRequest serviceRequest){
        return new ServiceResponse<>(userService.register(serviceRequest));
    }

    @PostMapping("/modifyuser")
    public ServiceResponse modify(@RequestBody ServiceRequest serviceRequest){
        return new ServiceResponse<>(userService.modify(serviceRequest));
    }

    @PostMapping("/updateicon")
    public ServiceResponse updateIcon(@RequestBody ServiceRequest serviceRequest){
        return new ServiceResponse<>(userService.updateIcon(serviceRequest));
    }

    @PostMapping("/geticon")
    public ServiceResponse getIcon(@RequestBody ServiceRequest serviceRequest) {
        return new ServiceResponse<>(userService.getIcon(serviceRequest));
    }

    @PostMapping("/getOnlineNumber")
    public ServiceResponse getOnlineNumber(@RequestBody ServiceRequest serviceRequest) {
        return new ServiceResponse<>(userService.getOnlineNumber(serviceRequest));
    }

    @PostMapping("/getuser")
    public ServiceResponse getUser(@RequestBody ServiceRequest serviceRequest) {
        return new ServiceResponse<>(userService.getUser(serviceRequest));
    }


    @PostMapping("/getuserall")
    public ServiceResponse getUserAll(@RequestBody ServiceRequest serviceRequest) {
        return new ServiceResponse<>(userService.getUserAll(serviceRequest));
    }

    @PostMapping("/modifydetail")
    public ServiceResponse modifyDetail(@RequestBody ServiceRequest serviceRequest) {
        return new ServiceResponse<>(userService.modifyDetail(serviceRequest));
    }




}
