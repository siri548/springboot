package com.example.student.model;
import javax.persistence.*;

@Entity
@Table(name="student")
public class Student{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private int id;
@Column(name="name")





}