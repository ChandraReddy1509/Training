package com.stream.api;

public class MessageImplementor {

	public static void main(String[] args) {
		MessageInterface mi = ()-> {
			
			String msg1 = "hhhh";
			String msg2 = "gggggg";
			if(msg1.length()>5 &&  msg2.length()>5) {
				return "cincatinated message:"+(msg1+msg2);
			}
			else if(msg1.length()>5) {
				return msg1;
			}
			else if(msg2.length()>5) {
				return msg2;
			}
			else {
				return "both have <= 5 Characters";
			}
		};
	System.out.println(mi.showMessage());
	}
		
	}

