package week_04.day_24_enum.src.task_03;

public class Order {
    static boolean isCompleted(OrderStatus status){
        return status == OrderStatus.DELIVERED || status == OrderStatus.CANCELLED;
    }
}
