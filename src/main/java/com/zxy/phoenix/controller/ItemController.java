/*
 * ............................................. 
 * 
 * 				    _ooOoo_ 
 * 		  	       o8888888o 
 * 	  	  	       88" . "88 
 *                 (| -_- |) 
 *                  O\ = /O 
 *              ____/`---*\____ 
 *               . * \\| |// `. 
 *             / \\||| : |||// \ 
 *           / _||||| -:- |||||- \ 
 *             | | \\\ - /// | | 
 *            | \_| **\---/** | | 
 *           \  .-\__ `-` ___/-. / 
 *            ___`. .* /--.--\ `. . __ 
 *        ."" *< `.___\_<|>_/___.* >*"". 
 *      | | : `- \`.;`\ _ /`;.`/ - ` : | | 
 *         \ \ `-. \_ __\ /__ _/ .-` / / 
 *======`-.____`-.___\_____/___.-`____.-*====== 
 * 
 * ............................................. 
 *              佛祖保佑 永无BUG 
 *
 * 佛曰: 
 * 写字楼里写字间，写字间里程序员； 
 * 程序人员写程序，又拿程序换酒钱。 
 * 酒醒只在网上坐，酒醉还来网下眠； 
 * 酒醉酒醒日复日，网上网下年复年。 
 * 但愿老死电脑间，不愿鞠躬老板前； 
 * 奔驰宝马贵者趣，公交自行程序员。 
 * 别人笑我忒疯癫，我笑自己命太贱； 
 * 不见满街漂亮妹，哪个归得程序员？
 *
 * 北纬30.√  154518484@qq.com
 */
package com.zxy.phoenix.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxy.phoenix.entity.Item;
import com.zxy.phoenix.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("item")
public class ItemController {
	@Autowired
	private ItemMapper itemMapper;

	@RequestMapping("list")
	public List<Item> list(){
		return itemMapper.getList();
	}

	@GetMapping("get/{id}")
	public Item getById(@PathVariable("id") String id){
		return itemMapper.get(id);
	}

	@GetMapping("page/{pageNum}/{pageSize}")
	public List<Item> page(@PathVariable("pageNum") Integer pageNum,@PathVariable("pageSize") Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		List<Item> items = itemMapper.getList();
		PageInfo page=new PageInfo(items);
		return page.getList();
	}

	@RequestMapping("upsert")
	public String add(Item item) {
		itemMapper.upsertItem(item);
		return "upsert success";
	}

	@RequestMapping("delete/{id}")
	public String delete(@PathVariable String id) {
		itemMapper.delete(id);
		return "delete success";
	}

    
}

