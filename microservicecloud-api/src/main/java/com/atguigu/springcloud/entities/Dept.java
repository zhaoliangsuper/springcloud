package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@NoArgsConstructor    //无参数构造函数
@AllArgsConstructor   //全参数的构造函数
@Data
@Accessors(chain=true)//链式风格访问，所有set方法返回的都是Dept对象
public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(String dname)
	{
		super();
		this.dname = dname;
	}

	public static void main(String[] args)
	{
		Dept dept = new Dept();
		dept.setDeptno(201L).setDname("RD").setDb_source("DB001");
		System.out.println(dept);
	}
	
}
