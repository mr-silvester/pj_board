package com.project.board;

import com.project.board.entity.Member;
import com.project.board.entity.Post;
import com.project.board.repository.PostMemoryRepository;
import com.project.board.repository.PostRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PostRepositoryTests {
    PostMemoryRepository postRepository = new PostMemoryRepository();

    @AfterEach
    void clearStore() {
        postRepository.clearStore();
    }

    /**
     * Create
     */
    @Test
    void createPostAndFindByPostIdTest() {
        //Given
        Post post = new Post();

        //When
        Long postId = postRepository.createPost(post);

        //Then
        assertThat(post).isEqualTo(postRepository.findByPostId(postId).get());
    }

    /**
     * Read
     */
    @Test
    void findByMemberIdTest() {
        //Given
        Member member1 = new Member();
        member1.setMemberId(001L);
        Member member2 = new Member();
        member2.setMemberId(002L);

        Post post1 = new Post();
        post1.setMember(member1);
        Post post2 = new Post();
        post1.setMember(member1);
        Post post3 = new Post();
        post1.setMember(member2);

        postRepository.createPost(post1);
        postRepository.createPost(post2);
        postRepository.createPost(post3);

        //When
        List<Post> result = postRepository.findByMemberId(member1.getMemberId());

        //Then
        assertThat(result.stream().findAny()).isEqualTo(member1.getMemberId());
    }

    @Test
    void findByNameTest() {
        //Given
        Member member1 = new Member();
        member1.setName("test");
        Member member2 = new Member();
        member1.setName("testMember");

        Post post1 = new Post();
        post1.setMember(member1);
        Post post2 = new Post();
        post1.setMember(member1);
        Post post3 = new Post();
        post1.setMember(member2);

        postRepository.createPost(post1);
        postRepository.createPost(post2);
        postRepository.createPost(post3);

        //When
        List<Post> result = postRepository.findByName("test");

        //Then
        assertThat(result.size()).isEqualTo(1);
    }

    @Test
    void findByPostTitleTest() {
        //Given
        Post post1 = new Post();
        post1.setPostTitle("this is test");
        Post post2 = new Post();
        post1.setPostTitle("this is test, too");
        Post post3 = new Post();
        post1.setPostTitle("hello world");

        postRepository.createPost(post1);
        postRepository.createPost(post2);
        postRepository.createPost(post3);

        //When
        List<Post> result = postRepository.findByPostTitle("test");

        //Then
        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void findByPostContentTest() {
        //Given
        Post post1 = new Post();
        post1.setPostContent("hello world");
        Post post2 = new Post();
        post1.setPostContent("hello spring");
        Post post3 = new Post();
        post1.setPostContent("jpa hibernate");

        postRepository.createPost(post1);
        postRepository.createPost(post2);
        postRepository.createPost(post3);

        //When
        List<Post> result = postRepository.findByPostContent("hello");

        //Then
        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void findAllTest() {
        //Given
        Post post1 = new Post();
        Post post2 = new Post();

        postRepository.createPost(post1);
        postRepository.createPost(post2);

        //When
        List<Post> result = postRepository.findAll();

        //Then
        assertThat(result.size()).isEqualTo(2);
    }

    /**
     * Read
     */
    @Test
    void updatePostTest() {
        //Given
        Post post = new Post();
        post.setPostContent("test content");
        Post updatedPost = new Post();
        updatedPost.setPostContent("updated post");
        postRepository.createPost(post);

        //When
        Post result = postRepository.updatePost(post, updatedPost);

        //Then
        assertThat(result.getPostContent()).isEqualTo(updatedPost.getPostContent());
    }

    /**
     * Delete
     */
    @Test
    void deletePostTest() {
        //Given
        Post post = new Post();
        postRepository.createPost(post);

        Long postId = post.getPostId();

        //When
        postRepository.deletePost(post);

        //Then
        assertThat(postRepository.findByPostId(postId).isPresent()).isEqualTo(false);
    }
}
