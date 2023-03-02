//package com.martinso.votingapp.contollers;
//
//import com.martinso.votingapp.exception.UserDetailsException;
//import com.martinso.votingapp.userdetails.data.model.UserDetails;
//import com.martinso.votingapp.userdetails.dto.request.CreateUserDetailsRequest;
//import com.martinso.votingapp.userdetails.dto.request.LoginRequest;
//import com.martinso.votingapp.userdetails.dto.request.LoginResponse;
//import com.martinso.votingapp.userdetails.dto.response.CreateUserDetailsResponse;
//import com.martinso.votingapp.userdetails.service.UserDetailsService;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.validation.Valid;
//import lombok.AllArgsConstructor;
//import org.modelmapper.internal.Errors;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//@RestController
//@AllArgsConstructor
//@RequestMapping("/api/v1/users")
//public class UserDetailsController {
//
//    private final UserDetailsService service;
//
//    @PostMapping("/register")
//    public ModelAndView register(@ModelAttribute("user") @Valid CreateUserDetailsRequest request,
//                                 HttpServletRequest requests, Errors errors){
////        CreateUserDetailsResponse response = service.register(request);
////        return ResponseEntity.ok().body(response);
//        try {
//            CreateUserDetailsResponse registered = service.register(request);
//
//        String appUrl = request.getContextPath();
//        eventPublisher.publishEvent(new OnRegistrationCompleteEvent(registered,
//          request.getLocale(), appUrl));
//    } catch (UserDetailsException uaeEx) {
//        ModelAndView mav = new ModelAndView("registration", "user", request);
//        mav.addObject("message", "An account for that username/email already exists.");
//        return mav;
//    } catch (RuntimeException ex) {
//        return new ModelAndView("emailError", "user", request);
//    }
//
//    return new ModelAndView("successRegister", "user", request);
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity< ? > UserLogin(@RequestBody LoginRequest request) {
//        LoginResponse response = service.userLogin(request);
//        return ResponseEntity.ok().body(response);
//    }
//    @GetMapping("{userId}")
//    public ResponseEntity<?> getUserByUsername(@PathVariable Long userId) {
//        var foundPassenger = service.getUserById(userId);
//        return ResponseEntity.status(HttpStatus.OK).body(foundPassenger);
//    }
//
//
//
//
//}
