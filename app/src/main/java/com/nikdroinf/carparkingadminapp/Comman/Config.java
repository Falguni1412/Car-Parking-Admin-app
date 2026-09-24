package com.nikdroinf.carparkingadminapp.Comman;

public class Config {

    private static String OnlineAddress = "http://192.168.1.10:80/car_parking/AdminApp/";
    public static String OnlineImageAddress = "http://192.168.1.10:80/smart_home_delivery/restaurantapp/upload/";

    public static String url_login = OnlineAddress+ "loginUser.php";
    public static String url_add_slot = OnlineAddress+ "addCarSlot.php";
    public static String url_all_view_booking = OnlineAddress+ "getAllViewBooking.php";
    public static String url_current_view_booking = OnlineAddress+ "getCurrentViewBooking.php";
    public static String url_all_users = OnlineAddress+ "getAllUsers.php";
    public static String url_all_feedback = OnlineAddress+ "getAllFeedback.php";
    public static String url_add_watchmen = OnlineAddress+ "addWatchmen.php";
    public static String url_delete_booking = OnlineAddress+ "addRemoveCarDetails.php";
    public static String url_add_remove_car_details=OnlineAddress+ "addRemoveCarDetails.php";

}
