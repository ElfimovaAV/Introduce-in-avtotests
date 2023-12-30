package org.max.lecture2.pattern.adapter;

import java.util.Date;

/**
 * Интерфейс адаптера
 */
public interface IAdapter {

    public void open();

    public Integer row();

    public String find(String searchString);

    public String author();

    public Integer size();

    public Date createDate();
}
