package game.human;

public class HumanServiceImpl implements HumanService{

	@Override
	public HumanDTO getMember(HumanDTO humanDTO) {
		
		HumanDAO dao = new HumanDAOImpl();
		
//		HumanDTO dto2 = dao.selectMember(humanDTO);
//		return dto2;

		humanDTO = dao.selectMember(humanDTO);
		return humanDTO;
		
	}
}
