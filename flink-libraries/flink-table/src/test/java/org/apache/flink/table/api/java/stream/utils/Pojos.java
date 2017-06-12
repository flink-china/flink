/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.flink.table.api.java.stream.utils;

import java.io.Serializable;

/**
 *  Pojos for testing.
 */
public class Pojos {
	/**
	 * Pojo0 for testing.
	 */
	public static class Pojo0 implements Serializable {

		private Integer myInt;
		private Long myLong;
		private Long myLong2;
		private String myString;

		public Pojo0() { }

		public Pojo0(Integer myInt, Long myLong, Long myLong2, String myString) {
			this.myInt = myInt;
			this.myLong = myLong;
			this.myLong2 = myLong2;
			this.myString = myString;
		}

		public Integer getMyInt() {
			return myInt;
		}

		public void setMyInt(Integer myInt) {
			this.myInt = myInt;
		}

		public Long getMyLong() {
			return myLong;
		}

		public void setMyLong(Long myLong) {
			this.myLong = myLong;
		}

		public Long getMyLong2() {
			return myLong2;
		}

		public void setMyLong2(Long myLong2) {
			this.myLong2 = myLong2;
		}

		public String getMyString() {
			return myString;
		}

		public void setMyString(String myString) {
			this.myString = myString;
		}

		@Override
		public String toString() {
			return "Pojo0{" +
			       "myInt=" + myInt +
			       ", myLong=" + myLong +
			       ", myLong2=" + myLong2 +
			       ", myString='" + myString + '\'' +
			       '}';
		}
	}
}
