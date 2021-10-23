package ch02;

public class Ex2_11 {
	
	public static void main(String[] args) {
		
		short sMin = -32768,  sMax = 32767;
		char  cMin = 0,       cMax = 65535;

		// 최소값 -1 => 최대값
		// 최대값 +1 => 최소값
		
		System.out.println("sMin  = " + sMin); // -32768
		System.out.println("sMin-1= " + (short)(sMin-1)); // 32767
		System.out.println("sMax  = " + sMax); // 32767
		System.out.println("sMax+1= " + (short)(sMax+1)); // -32768
		System.out.println("cMin  = " + (int)cMin); // 0
		System.out.println("cMin-1= " + (int)--cMin); // 65535
		System.out.println("cMax  = " + (int)cMax); // 65535
		System.out.println("cMax+1= " + (int)++cMax); // 0 
		
	}
}
