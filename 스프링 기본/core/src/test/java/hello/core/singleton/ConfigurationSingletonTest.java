package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.Order.OrderService;
import hello.core.Order.OrderServiceImpl;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigurationSingletonTest {

    @Test
    @DisplayName("스프링은 과연 싱글톤을 유지할 수 있을까?")
    void configurationTest() {
        AppConfig appConfig = new AppConfig();
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberServiceImpl memberService1 = ac.getBean(MemberServiceImpl.class);
        OrderServiceImpl orderService1 = ac.getBean(OrderServiceImpl.class);
        MemberRepository memberRepository = ac.getBean(MemberRepository.class);

        assertThat(orderService1.getMemberRepository()).isSameAs(memberService1.getMemberRepository());
        assertThat(orderService1.getMemberRepository()).isSameAs(memberRepository);
    }
}
