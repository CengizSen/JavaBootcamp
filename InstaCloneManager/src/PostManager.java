
public class PostManager {

	public void postAdd(Post post) {
		System.out.println(post.getPostName()+" isimli g�nderiniz Eklendi");
	}
	
	public void postUpdate(Post post) {
		System.out.println(post.getPostName()+ " isimli g�nderiniz Guncellendi");
	}
	
	public void postDelete(Post post ) {
		System.out.println(post.getPostName()+ " isimli g�nderiniz Silindi");
	}
	
	
	
	
}
