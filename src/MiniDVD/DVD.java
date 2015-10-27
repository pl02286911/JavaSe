package MiniDVD;

import java.text.SimpleDateFormat;
import java.util.*;

public class DVD {
		private String name;
		private String borrowDate;
		private String returnDate;
		private String state;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBorrowDate() {
			return borrowDate;
		}
		public void setBorrowDate(String borrowDate) {
			this.borrowDate = borrowDate;
		}
		public String getReturnDate() {
			return returnDate;
		}
		public void setReturnDate(String returnDate) {
			this.returnDate = returnDate;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public DVD(String name, String borrowDate, String returnDate, String state) {
			super();
			this.name = name;
			this.borrowDate = borrowDate;
			this.returnDate = returnDate;
			this.state = state;
		}
		public DVD() {
			super();
		}
	
		
}
