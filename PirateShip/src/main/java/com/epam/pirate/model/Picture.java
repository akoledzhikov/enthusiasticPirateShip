package com.epam.pirate.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import net.karneim.pojobuilder.GeneratePojoBuilder;


@Entity
@Table(name = "pictures")
@GeneratePojoBuilder(withSetterNamePattern = "*")
public class Picture
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private byte[] content;


    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
    }


    public byte[] getContent()
    {
        return content;
    }


    public void setContent(byte[] content)
    {
        this.content = content;
    }

}
