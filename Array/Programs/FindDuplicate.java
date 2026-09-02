class FindDuplicate
{
	public static void main (String args[])
	{
		int a[] = {1,2,3,3,4,5,2,1,5,6,7};
		findDuplicate(a);
	}
		private static void findDuplicate(int a[])
		{
			for(int i = 0 ;i < a.length ;i++)
			{
				boolean alreadyChecked = false , isDuplicate = false;
 				for(int j = 0 ; j < i ; j++)
					if(a[i] == a[j])
					{
						alreadyChecked = true;
						break;
					} 
				if(!alreadyChecked)
				for(int j = i+1 ; j < a.length ; j++)
					if(a[i] == a[j])
					{
						isDuplicate = true ; 
						break ;
					}
				if(isDuplicate)
				System.out.println(a[i]);
			}
		}
	
}