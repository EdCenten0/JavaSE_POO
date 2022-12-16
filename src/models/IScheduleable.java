package models;

import java.util.Date;

public interface IScheduleable {
    public void schedule(Date date, String time);
}
