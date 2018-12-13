package com.leetcode;

public class RomanToInteger {
	public int romanToInt(String s) {
		int number = 0;

		char[] chArray = s.toCharArray();
		int length = s.length();
		char ch = '/';
		int negative = 0;
		char chPrev = '/';
		for(int i=0; i<length; i++) {
			ch = chArray[i];

			if(ch == 'I') {
				chPrev = 'I';
				negative = 2;
				number += 1;
			} else if (ch == 'V') {
				number += 5;
				if(chPrev == 'I') {
					number -= negative;
					negative = 0;
				}
				negative = 10;
				chPrev = 'V';
			} else if (ch == 'X') {
				number += 10;
				if(chPrev == 'I' || chPrev == 'V') {
					number -= negative;
					negative = 0;
				}
				negative = 20;
				chPrev = 'X';
			} else if (ch == 'L') {
				number += 50;
				if(chPrev == 'I' || chPrev == 'V' || chPrev == 'X') {
					number -= negative;
					negative = 0;
				}
				negative = 100;
				chPrev = 'L';
			} else if (ch == 'C') {
				number += 100;
				if(chPrev == 'I' || chPrev == 'V' || chPrev == 'X' || chPrev == 'L') {
					number -= negative;
					negative = 0;
				}
				negative = 200;
				chPrev = 'C';
			} else if (ch == 'D') {
				number += 500;
				if(chPrev == 'I' || chPrev == 'V' || chPrev == 'X' || chPrev == 'L' || chPrev == 'C') {
					number -= negative;
					negative = 0;
				}
				negative = 1000;
				chPrev = 'D';
			} else if (ch == 'M') {
				number += 1000;
				if(chPrev == 'I' || chPrev == 'V' || chPrev == 'X' || chPrev == 'L' || chPrev == 'C' || chPrev == 'D') {
					number -= negative;
					negative = 0;
				}
			}
		}

		return number;
	}

	public static void main(String[] args) {
		int value = new RomanToInteger().romanToInt("MCMXCIV");
		System.out.println(value);
	}
}