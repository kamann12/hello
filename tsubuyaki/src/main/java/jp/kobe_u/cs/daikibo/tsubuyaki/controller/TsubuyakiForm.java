package jp.kobe_u.cs.daikibo.tsubuyaki.controller;

import lombok.Data;

@Data
public class TsubuyakiForm {
    private String name; //投稿者
    private String comment; //つぶやき（省略不可）
}
