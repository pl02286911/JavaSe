package cn.zucc.day06;

public class MapEntry {
		private String key;
		private	String value;
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public MapEntry(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		public MapEntry() {
			super();
		}
		
}
