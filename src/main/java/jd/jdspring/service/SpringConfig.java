package jd.jdspring.service;

import jd.jdspring.repository.MemberRepository;
import jd.jdspring.repository.MemoryMemberRepository;
import jd.jdspring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}