package retryfaildTc;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class RetryFailed {
		static int num=5;

		@Test(retryAnalyzer = retryfaildTc.MyRetryAnalyzer.class)
		public void Test1()
		{
			Assert.assertEquals(false, true);
		}
		@Test
		public void Test2()
		{
			Assert.assertEquals(false, true);
		}	
		@Test(retryAnalyzer = retryfaildTc.MyRetryAnalyzer.class)
		public void Test3()
		{
			num--;
			Assert.assertTrue(num<4);//4<4 | 3<4 
		}
	}

