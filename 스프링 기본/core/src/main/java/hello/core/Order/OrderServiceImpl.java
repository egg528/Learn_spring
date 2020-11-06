package hello.core.Order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberReposiroty;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private MemberReposiroty memberReposiroty;
    private DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberReposiroty memberReposiroty, DiscountPolicy discountPolicy) {
        this.memberReposiroty = memberReposiroty;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberReposiroty.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);

    }
}
