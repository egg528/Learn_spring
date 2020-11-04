package hello.core.member;

public interface MemberReposiroty {

    void save(Member member);

    Member findById(Long memberId);
}
