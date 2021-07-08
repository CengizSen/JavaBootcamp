
public class Main {

	public static void main(String[] args) {
         
		User user1=new User(1, "Cengiz", "Sen", "Yazilim Gelistirici", "cengiizsen");
		User user2=new User(2, "Zeynep", "Erdog", "", "zeynererdog");

		User[] users= {user1,user2};
		
		for(User user:users) {
			System.out.println(user.id);
		}
		
		Post post =new Post();
		post.setPostId(158);
		post.setPostLikeCount(25);
		post.setPostDescription("Ýnstagram Clone Manager");
		post.setPostName("Cengiz'in attigi post ");
		
		
		
		
        System.out.println(post.getPostId());
	
        
        
		PostManager manager=new PostManager();
		manager.postAdd(post);
		manager.postDelete(post);
		manager.postUpdate(post);

		
		
		System.out.println("Degerli "+user2.firstName +","+" " +   post.getPostName()+"isimli postunuz eklendi." );
		
		
		
		
		
		
		
		
	}

}
