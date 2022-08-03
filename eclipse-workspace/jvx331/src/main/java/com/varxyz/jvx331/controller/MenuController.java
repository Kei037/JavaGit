package com.varxyz.jvx331.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.varxyz.jvx331.command.FindMenuItemCommand;
import com.varxyz.jvx331.command.MenuItemCommand;
import com.varxyz.jvx331.menu.BeverageCategory;
import com.varxyz.jvx331.service.MenuItemServiceImpl;

@MultipartConfig(
	    fileSizeThreshold = 1024*1024,
	    maxFileSize = 1024*1024*50, 		//50메가
	    maxRequestSize = 1024*1024*50*5) 	// 50메가 5개까지
@Controller("controller/menuController")
public class MenuController {
	
	@Autowired
	public MenuItemServiceImpl menuItemService;
	
	// 메뉴추가 화면구현
	@GetMapping("/admin_page/add_menu")
	public String addMenuForm(Model model) {
		model.addAttribute("menu", new MenuItemCommand());
		return "admin_page/add_menu";
	}
	
	// 대분류 select박스
	@ModelAttribute("categoryProviderList")
	public List<CategoryProvider> getCategoryProviderList(){
		List<CategoryProvider> list = new ArrayList<CategoryProvider>();
		list.add(new CategoryProvider(101, "음료"));
		list.add(new CategoryProvider(102, "음식"));
		
		return list;
	}
	// 소분류 select박스
	@ModelAttribute("subCategoryProviderList")
	public List<SubCategoryProvider> getSubCategoryProviderList(){
		List<SubCategoryProvider> list = new ArrayList<SubCategoryProvider>();
		list.add(new SubCategoryProvider(501, "커피"));
		list.add(new SubCategoryProvider(502, "프라푸치노"));
		list.add(new SubCategoryProvider(503, "블렌디드"));
		list.add(new SubCategoryProvider(504, "차"));
		list.add(new SubCategoryProvider(505, "콜드브루"));
		list.add(new SubCategoryProvider(506, "주스"));
		
		list.add(new SubCategoryProvider(507, "빵"));
		list.add(new SubCategoryProvider(508, "케이크"));
		list.add(new SubCategoryProvider(509, "샌드위치"));
		list.add(new SubCategoryProvider(510, "스낵"));
		list.add(new SubCategoryProvider(511, "아이스크림"));
		return list;
	}
	
	private static final String SAVE_DIR = "C:\\Users\\Junyoung\\Desktop\\coffee_img\\";
	
	// 메뉴추가 form
	@PostMapping("/admin_page/add_menu")
	public String addMenu(@ModelAttribute("menu")
					MenuItemCommand menu, Model model,
					@RequestParam("imgFile") MultipartFile file){
		System.out.println("-----------");
		String fileRealName = file.getOriginalFilename(); //파일명을 얻어낼 수 있는 메서드
		long size = file.getSize(); //파일 사이즈
		
		System.out.println("파일명 : "  + fileRealName);
		System.out.println("용량크기(byte) : " + size);
		
		String fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."),fileRealName.length());
		
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());
		String[] uuids = uuid.toString().split("-");
		
		String uniqueName = uuids[0];
		System.out.println("생성된 고유문자열" + uniqueName);
		System.out.println("확장자명" + fileExtension);
		
		File saveFile = new File(SAVE_DIR+"\\"+uniqueName + fileExtension);  // 적용 후
		try {
			file.transferTo(saveFile); // 실제 파일 저장메서드(filewriter 작업을 손쉽게 한방에 처리해준다.)
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		menu.setImg(uniqueName+fileExtension);
		String imgName = menu.getImg();
		System.out.println(imgName);
		model.addAttribute("imgName", imgName);
		menuItemService.addMenuItem(menu);
		return "admin_page/success_add_menu";
	}
	
	
	@GetMapping("/admin_page/find_menu")
	public String findMenuForm(HttpServletRequest request) {
		System.out.println("-------------------------------");
		menuItemService.allFindMenu();
		System.out.println(menuItemService.allFindMenu());
		List<FindMenuItemCommand> test = menuItemService.allFindMenu();
		for (FindMenuItemCommand result : test) {
			request.setAttribute("result", result);
		}
		request.setAttribute("test", test);
		return "admin_page/find_menu";
	}
}
