package com.boot.demo.validator;

import com.boot.demo.model.Board;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.thymeleaf.util.StringUtils;

//아래 사이트 참고
//https://cjw-awdsd.tistory.com/50
@Component
public class BoardValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
//        return clazz.isAssignableFrom(Board.class);
//        return Board.class.isAssignableFrom(clazz);
        return Board.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Board board = (Board) target;
        if (StringUtils.isEmpty(board.getContent())){
//            errors.rejectValue("content", "key");
            errors.rejectValue("content", "key","내용을 입력하세요.");
        }
    }
}
