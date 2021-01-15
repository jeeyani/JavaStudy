package ch14.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {

		
		private List<Product> list = new ArrayList<Product>();
		private Scanner sc =new Scanner(System.in);
		private int counter;
		
		

		public void showmenu(){
			
			while(true) {
				System.out.println("---------------------------");
				System.out.println("1. 등록  | 2. 목록  | 3. 종료");
				System.out.println("---------------------------");
				
			 
				System.out.print("선택: ");
				String selectNo = sc.nextLine();
				switch (selectNo) {
				case "1":
					reProduct();

					break;
				case "2":
					showProduct();
					break;
				case "3":

					return;

				}

			}
			
		}
		
		public void reProduct() {
			try {
				
				Product product = new Product();
				product.setPno(++counter);
				
				System.out.print("상품명: ");
				product.setName(sc.nextLine());
				
				System.out.print("가격: ");
				product.setPrice(Integer.parseInt(sc.nextLine()));
				
				System.out.print("재고: ");
				product.setStock(Integer.parseInt(sc.nextLine()));
				
				list.add(product);
				
				
			}catch (Exception e) {
				System.out.println("등록 에러: "+e.getMessage());
			}
		}
		
		public void showProduct() {
			for(Product p: list) {
				System.out.println(p.getPno()+"\t"+p.getName()+"\t"+p.getPrice()+"\t"+p.getStock());
				
			}
		}
	

}
