package com.callor.shop.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;
import com.callor.shop.values.Values;

public class CartServiceImplV1 implements CartService {

	/*
	 * ImplV1에서 inputCart() method를 사용하여
	 * cartList에 상품리스트를 추가하고
	 * 
	 * ImplV1을 상속받은 ImplV2의
	 *  새로운 save...()method에서
	 *  cartList에 저장된 데이터를 사용하려고 시도했다
	 *  
	 * 이러한 경우에
	 * private으로 선언된 변수 또는 객체는 서로 공유가 되지 않는다
	 * 상속받은 클래스의 method에서 변수 또는 객체를 공유하려면
	 * 		부모클래스에서 변수(객체)를 반드시 protected로 선언해주어야 한다
	 * 또한 상속받은 클래스에서는 해당 변수(객체)를 선언해서는 안된다.
	 */
	protected List<CartVO> cartList;
	private final Scanner scan;
	public CartServiceImplV1() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}

	@Override
	public void inputCart() {
		// TODO 카트 추가 method
		System.out.println(Values.dLine);
		System.out.println("장바구니 추가");
		System.out.println(Values.sLine);

		System.out.println("구매자 이름을 입력하세요");
		System.out.print(">> ");
		String strUserName = scan.nextLine();

		System.out.println("추가할 상품이름을 입력하세요");
		System.out.print(">> ");
		String strProductName = scan.nextLine();

		System.out.println("추가할 상품의 수량을 입력하세요");

		Integer intQty = 0;
		while (true) {
			System.out.print(">> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
			} catch (Exception e) {
				System.out.println("수량은 숫자만 입력하세요");
			} // try문 밖으로 if문을 뺐다. Java_021 프로젝트와 비교해서 확인 해보기
			if(intQty < 1) {
				System.out.println("수량은 1이상 입력하세요");
			} else {
				break;
			}
		}

		Integer intPrice = 0;
		while (true) {
			System.out.print(">> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
			} catch (Exception e) {
				System.out.println("가격은 숫자만 입력하세요");
			} // try문 밖으로 if문을 뺐다. Java_021 프로젝트와 비교해서 확인 해보기
			if(intPrice < 100) {
				System.out.println("가격은 100이상 입력하세요");
			} else {
				break;
			}
		}
		
		Integer intTotal = intQty * intPrice;
		
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProductName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intTotal);
		
		System.out.println(Values.dLine);
		System.out.println("입력한 상품");
		System.out.println(Values.sLine);
		System.out.printf("구매자 : %s\n", cartVO.getUserName());
		System.out.printf("상품명 : %s\n", cartVO.getProductName());
		System.out.printf("수량 : %d\n", cartVO.getQty());
		System.out.printf("가격 : %d\n", cartVO.getPrice());
		System.out.printf("합계 : %d\n", cartVO.getTotal());
		System.out.println(Values.dLine);
		System.out.print("추가할까요(YES)?");
		String strYesNO = scan.nextLine();
		if(strYesNO.equals("YES")) {
			cartList.add(cartVO);
			System.out.println("저장완료");
		} else {
			System.out.println("저장취소");
		}
	}

	/*
	 * private으로 선언된 method는
	 * 현재 클래스에서만 호출이 가능한 method
	 */
	private void printHeader() {
		System.out.println(Values.dLine);
		System.out.println("구매자\t상품명\t" + "단가\t수량\t금액\t");
		System.out.println(Values.sLine);
	}
	
	private void printBody(CartVO cartVO) { // CartVO를 매개변수로 받음
		// cartVO에서 각 인스턴스 변수를 읽어서 출력
		System.out.printf("%s\t", cartVO.getUserName());
		System.out.printf("%s\t", cartVO.getProductName());
		System.out.printf("%d\t", cartVO.getQty());
		System.out.printf("%d\t", cartVO.getPrice());
		System.out.printf("%d\n", cartVO.getTotal());
		// 코드도 간소해지고, 실행도 효율적

	}
	
	
	@Override
	public void printAllCart() {

		this.printHeader(); // 여기에 private된 printHeader 메서드를 풀어준다.
		
		// 카트리스트의 상품개수를
		//		계산하여 nSize에 저장
		int nSize = cartList.size();
		for(int i = 0; i <nSize; i++) {
			
			/*
			 * cartList.get(i)는
			 * cartList에 저장되어있는 i 번째 요소
			 * 이 요소는 CartVO 클래스로 만든 객체인 cartVO
			 */
			/*
			System.out.println(cartList.get(i).getUserName() + "\t");
			System.out.println(cartList.get(i).getProductName() + "\t");
			*/
			// Q. 이 코드들을 어떻게 하면 줄일 수 있을까
			
			// A. cartList의 i번째 요소를 getter하여
			// 	임시(for() 명령 내에 있기 때문에) 선언된 
			// 	CartVO클래스의 cartVO 객체에 저장하라
			CartVO cartVO = cartList.get(i);
			
			this.printBody(cartVO); // 여기에 private된 printBody 메서드를 풀어준다
		}
		System.out.println(Values.sLine);
	}

	@Override
	public void printUserCart() {
		System.out.println(Values.dLine);
		System.out.println("구매자별 리스트");
		System.out.print("구매자명 >>");
		String strUserName = scan.nextLine();

		this.printHeader();
		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			CartVO cartVO = cartList.get(i);
			if (cartVO.getUserName().equals(strUserName)) {
				this.printBody(cartVO);
			}
		}

	}

}
