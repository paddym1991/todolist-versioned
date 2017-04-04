package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created by Paddym1991 on 04/04/2017.
 */
@Entity
public class Todo extends Model
{
    public String title;

    public Todo(String title)
    {
        this.title = title;
    }
}
