package kr.co.fastcampus.eatgo.util;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    public String createToken(Long id, String name) {
        return "header.payload.signature";
    }
}
