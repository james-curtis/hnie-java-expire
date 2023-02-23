import com.example.phone.service.impl.PhoneServiceImpl;
import com.example.vote.service.impl.VoteServiceImpl;

public class Test {

    @org.junit.Test
    public void expireTest1() {
        PhoneServiceImpl phoneService = new PhoneServiceImpl();
        phoneService.loadPhoneList();
        phoneService.testAllPhone();
    }

    @org.junit.Test
    public void expireTest2() {
        VoteServiceImpl voteServiceImpl = new VoteServiceImpl();
        voteServiceImpl.loadVoter();
        voteServiceImpl.countVotes();
        voteServiceImpl.displayResults();
    }

}
