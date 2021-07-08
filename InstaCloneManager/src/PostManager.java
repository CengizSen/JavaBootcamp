
public class PostManager {

	public void postAdd(Post post) {
		System.out.println(post.getPostName()+" isimli gönderiniz Eklendi");
	}
	
	public void postUpdate(Post post) {
		System.out.println(post.getPostName()+ " isimli gönderiniz Guncellendi");
	}
	
	public void postDelete(Post post ) {
		System.out.println(post.getPostName()+ " isimli gönderiniz Silindi");
	}
	
	
	
	
}
