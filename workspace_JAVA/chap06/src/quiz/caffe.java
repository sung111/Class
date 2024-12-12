package quiz;

import java.util.Scanner;

public class caffe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int
		dkap = 3000,
		zkvp = 4000,
		qhr = 3500,
		shr = 3000,
		sum = 0;
		
		boolean end = true;
		boolean end1 = true;
		
		
		do {
			System.out.println("==================================");
			System.out.println(" |1:주문하기| |2:종료하기|3.결제금액확인|");
			System.out.println("==================================");
			int s1 = scan.nextInt();
			if(s1 == 1) {
				System.out.println("메뉴를 골라주세요.");
				System.out.println("1.커피");
				System.out.println("2.음료");

				System.out.println("3.뒤로가기");
				System.out.println("4.종료");
				
				int s2 = scan.nextInt();
				if(s2 == 1) {
					System.out.println("1.아메리카노 " + dkap + "원입니다.");
					System.out.println("2.카페라떼 " + zkvp + "원입니다.");
					System.out.println("3.처음으로돌아가기");
					System.out.println("4.종료하기");
					int s0 = scan.nextInt();
					if(s0 == 1) {
						do {
							System.out.println("아메리카노를 선택하셨습니다.");
							System.out.println("개수를 입력해주세요");//취소후 종료하기
							System.out.println("취소후 종료하기 : 0");
							int s3 = scan.nextInt();
							if(s3 == 0) {
								System.out.println("프로그램을종료합니다.");
								end=false;
								end1=false;
								break;
							}
							else if(s3 > 0) {
								System.out.println(s3 + "개 주문하시겠습니까?");
								System.out.println("가격은 "+ (s3 * dkap) +"원 입니다");
								System.out.println("1: yes / 2:no");
								int s4 = scan.nextInt();
								if(s4 == 1) {
									System.out.println("가격은 "+ (s3 * dkap) +"원 입니다");
									sum = sum+s3 * dkap;
//									end=false;
//									end1=false;
									break;
								}else {
									System.out.println("처음으로 돌아갑니다.");
									break;
								}
							}else {
								System.out.println("1개 이상 입력해주세요");
							}
						}while(end1);
					}
					else if(s0==2) {
						do {
							System.out.println("카페라떼 선택하셨습니다.");
							System.out.println("개수를 입력해주세요");
							System.out.println("취소후 종료하기 : 0");
							int s3 = scan.nextInt();
							if(s3 == 0) {
								System.out.println("프로그램을종료합니다.");
								end=false;
								end1=false;
								break;
							}
							if(s3 > 0) {
								System.out.println(s3 + "개 주문하시겠습니까?");
								System.out.println("가격은 "+ (s3 * zkvp) +"원 입니다");
								System.out.println("1: yes / 2:no");
								int s4 = scan.nextInt();
								if(s4 == 1) {
									System.out.println("가격은 "+ (s3 * zkvp) +"원 입니다");
									sum = sum + s3 * zkvp;
//									end=false;
//									end1=false;
									break;
								}else {
									System.out.println("처음으로 돌아갑니다.");
									break;
								}
							}else {
								System.out.println("1개 이상 입력해주세요");
							}
						}while(end1);
					}
					else if(s0 == 3) {
						System.out.println("처음으로 되돌아갑니다.");
						continue;
					}
					else if(s0 == 4) {
						System.out.println("프로그램을 종료합니다.");
						end = false;
						break;
					}
				}
				else if(s2 == 2) {
					System.out.println("1.복숭아 아이스티 " + qhr + "원입니다.");
					System.out.println("2.녹차 " + shr + "원입니다.");
					System.out.println("3.처음으로돌아가기");
					System.out.println("4.종료하기");
					int s0 = scan.nextInt();
					if(s0 == 1) {
						do {
							System.out.println("복숭아 아이스티를 선택하셨습니다.");
							System.out.println("개수를 입력해주세요");
							System.out.println("취소후 종료하기 : 0");
							int s3 = scan.nextInt();
							if(s3 == 0) {
								System.out.println("프로그램을종료합니다.");
								end=false;
								end1=false;
								break;
							}
							else if(s3 > 0) {
								System.out.println(s3 + "개 주문하시겠습니까?");
								System.out.println("가격은 "+ (s3 * qhr) +"원 입니다");
								System.out.println("1: yes / 2:no");
								int s4 = scan.nextInt();
								if(s4 == 1) {
									System.out.println("가격은 "+ (s3 * qhr) +"원 입니다");
									sum = sum + s3 * qhr;
//									end=false;
//									end1=false;
									break;
								}else {
									System.out.println("처음으로 돌아갑니다.");
									break;
								} 
							}else {
								System.out.println("1개 이상 입력해주세요");
							}
						}while(end1);
						
					}
					else if(s0==2) {
						do {
							System.out.println("녹차를 선택하셨습니다.");
							System.out.println("개수를 입력해주세요");
							System.out.println("취소후 종료하기 : 0");
							int s3 = scan.nextInt();
							if(s3 == 0) {
								System.out.println("프로그램을종료합니다.");
								end=false;
								end1=false;
								break;
							}
							if(s3 > 0) {
								System.out.println(s3 + "개 주문하시겠습니까?");
								System.out.println("가격은 "+ (s3 * shr) +"원 입니다");
								System.out.println("1: yes / 2:no");
								int s4 = scan.nextInt();
								if(s4 == 1) {
									System.out.println("가격은 "+ (s3 * shr) +"원 입니다");
									sum = sum + s3 * shr;
//									end=false;
//									end1=false;
									break;
								}else {
									System.out.println("처음으로 돌아갑니다.");
									break;
								}
							}else {
								System.out.println("1개 이상 입력해주세요");
							}
						}while(end1);
						
					} else if(s0 == 3) {
						System.out.println("처음으로 되돌아갑니다.");
						continue;
					} else if(s0 == 4) {
						System.out.println("프로그램을 종료합니다.");
						end = false;
						break;
					}
					
				}

				else if(s2 == 3) {
					System.out.println("처음으로 돌아갑니다.");
					continue;
				}else if(s2 == 4) {
					System.out.println("프로그램을 종료합니다.");
					end = false;
					break;
				}
				
				
				
				
			}else if(s1 == 2) {
				System.out.println("프로그램을 종료합니다.");
				end = false;
				break;
			}else if(s1 == 3) {
				System.out.println("총 결제 금액은" + sum + "원 입니다.");
				System.out.println("1.계산하기|2.취소하기");
				int s5 = scan.nextInt();
				if(s5 == 1) {
					System.out.println(sum +"원 계산을 완료했습니다.");
					break;
				}else if(s5==2) {
					System.out.println("프로그램을 종료합니다.");
					end=false;
					end1=false;
					break;
				}else {
					System.out.println("메뉴내에서 선택바랍니다.");
				}
			}else {
				System.out.println("메뉴내에서 선택바랍니다.");
			}
			
		}while(end);
		
		
		
		
		
	}

}
