package site.yolowa.test.ts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import site.yolowa.dao.BoardDAO;
import site.yolowa.dto.Board;
import site.yolowa.service.AdminEtcService;
import site.yolowa.service.AdminMemberServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ServiceSH {
	private static final Logger logger=LoggerFactory.getLogger(ServiceSH.class);
	
	@Autowired
	AdminEtcService adminEtcService;
	
	@Autowired
	BoardDAO boardDAO;
	
	/*
	@Test
	public void service() {
		
	}
	*/
	
	/*
	@Test
	public void service(){
		Board board = new Board();
		board.setBoardNo(34);
		board.setBoardWriterNo(1);
		board.setBoardTitle("�Խ��� �׽�Ʈ12");
		board.setBoardContent("��Ŭ���� ���� �Խ��� �׽�Ʈ �Դϴ�.12 - ���ҽ�");
		board.setBoardImage("�̹������");
		board.setBoardState(1);
		board.setBoardCategory(1);
		board.setBoardDate("20/04/16");
		board.setBoardViewCount(0);
		board.setBoardType(1);
		logger.info("�Խ��� ��ȣ = "+board.getBoardNo()+", �ۼ��� = "+board.getBoardWriterNo()+", ���� = "+board.getBoardTitle()+
					", ���� = "+board.getBoardContent()+", �̹��� = "+board.getBoardImage()+", �Խ� ���� = "+board.getBoardState()+
					", �Խñ� ���� = "+board.getBoardCategory()+",�Խñ� ��¥ = "+board.getBoardDate()+", ī��Ʈ = "+board.getBoardViewCount()+
					", �Խñ� Ÿ�� = "+board.getBoardType());
		logger.info("�Խ��� �߰� ���� ��� ���� ����");
	}
	*/
	
	
	@Test
	public void service() {
		Board board=new Board();
		board.setBoardNo(1);
		
		logger.info("�Խ��� ��ȣ = "+board.getBoardNo()+", �ۼ��� = "+board.getBoardWriterNo()+", ���� = "+board.getBoardTitle()+
				", ���� = "+board.getBoardContent()+", �̹��� = "+board.getBoardImage()+", �Խ� ���� = "+board.getBoardState()+
				", �Խñ� ���� = "+board.getBoardCategory()+",�Խñ� ��¥ = "+board.getBoardDate()+", ī��Ʈ = "+board.getBoardViewCount()+
				", �Խñ� Ÿ�� = "+board.getBoardType());
	logger.info("�Խ��� �߰� ���� ��� ���� ����");
		
	}
	

	
	
}