package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private MemberReposiroty memberRepository;

    public MemberServiceImpl(MemberReposiroty memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
