package hello.core.member;

public class MemberServiceImpl implements MemberService{

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }//이렇게 변경되어야 추상화에 의존
    //생성자를 통해서

    private final MemberRepository memberRepository;



    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
