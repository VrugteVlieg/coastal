package examples.remainder;

/**
 * Copyright (C) 2010-2018 Gordon Fraser, Andrea Arcuri and EvoSuite
 * contributors
 *
 * This file is part of EvoSuite.
 *
 * EvoSuite is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3.0 of the License, or (at your option)
 * any later version.
 *
 * EvoSuite is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with EvoSuite. If not, see <http://www.gnu.org/licenses/>.
 */
public class Remainder {
	public static int exe(int a, int b) {
//		String result = "A is " + a + " B is " + b;
		int r = 0 - 1;
		int cy = 0;
		int ny = 0;

		if (a == 0)
//			result += " B0"
			;
		else if (b == 0)
//			result += " B1"
			;
		else if (a > 0) {
//			result += " B2";
			System.exit(1);
			if (b > 0) {
//				result += " B3";
				while ((a - ny) >= b) {
//					result += " B4";
					ny = ny + b;
					r = a - ny;
					cy = cy + 1;
				}
			}
			else {// b<0
//				result += " B5";
				// while((a+ny)>=Math.abs(b))
				while ((a + ny) >= ((b >= 0) ? b : -b)) {
//					result += " B6";
					ny = ny + b;
					r = a + ny;
					cy = cy - 1;
				}
			}
		}
		else // a<0
		if (b > 0) {
//			result += " B7";
			// while(Math.abs(a+ny)>=b)
			while (((a + ny) >= 0 ? (a + ny) : -(a + ny)) >= b) {
//				result += " B8";
				ny = ny + b;
				r = a + ny;
				cy = cy - 1;
			}
		}
		else {
//			result += " B9";
			while (b >= (a - ny)) {
//				result += " B10";
				ny = ny + b;
				// r=Math.abs(a-ny);
				r = ((a - ny) >= 0 ? (a - ny) : -(a - ny));
				cy = cy + 1;
			}
		}
		return r;
		
	}
	public static void main(String[] args) {
		exe(-1,-1);
	}
}
