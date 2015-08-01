package org.starter.netty;

import org.junit.Test;

public class Starter01 {

	@Test
	public void t002() {
		/**
		 * 实现discard协议
		 * 
		 * 	ChannelHandlerAdapter实现ChannelHandler接口
		 * 	
		 * 	处理器的职责是释放所有传递到处理器的引用计数对象
		 * 
		 * 	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		 * 		try {
		 * 
		 * 		} finally {
		 * 			ReferenceCountUtil.release(msg);
		 * 		}
		 * 	}
		 * 
		 */
		
		
	}
	
	@Test
	public void t001() {
		/**
		 * 
		 * netty5 用户指南
		 * 
		 * 经常使用一个HTTP客户端来从web服务器上获取信息，敬老通过web service来执行
		 * 远程调用
		 * 
		 * 然而，实现一个优化的ajax聊天应用、媒体流传输或者是大文件推送
		 * 
		 */
	}
}
