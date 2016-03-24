package com.jschool.services.api.exception;

/**
 * Created by infinity on 19.02.16.
 */
public enum ServiceStatusCode {

    USER_OR_DRIVER_ALREADY_EXIST, DRIVER_NOT_FOUND, DRIVER_ASSIGNED_ORDER, USER_NOT_FOUND,DRIVER_HOURS_LIMIT, DRIVER_NOT_ASSIGNED,

    CODRIVER_DRIVING, DRIVER_HAS_STAUS, USER_ALREADY_EXIST, DRIVER_ALREADY_EXIST,

    TRUCK_ASSIGNED_ORDER,TRUCK_DID_NOT_ASSIGNED_ORDER,TRUCK_ALREADY_EXIST,TRUCK_NOT_FOUND,TRUCK_WEIGHT_NOT_ENOUGH,

    TRUCK_NOT_IN_SAME_CITY,DRIVER_NOT_IN_SAME_CITY,

    ORDER_ALREADY_EXIST,ORDER_NOT_FOUND,ORDER_DID_NOT_DONE,

    CITY_NOT_FOUND, VERIFY_CODE_NOT_FOUND,

    CARGO_ALREADY_EXIST,CARGO_NOT_FOUND,

    DRIVER_AND_SHIFT_SIZE_NOT_EQUAL, TWILIO_EXCEPTION, MAIL_EXCEPTION,

    UNKNOWN
}
