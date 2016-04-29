package com.movies.controller.admin;

import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.movies.entity.Movie;
import com.movies.service.MovieService;

@Controller("adminMovieController")
@RequestMapping("/admin/movie")
public class MovieController extends BaseController {

	@Resource(name = "movieServiceImpl")
	private MovieService movieService;

	
	/**
	 * 电影列表
	 * 
	 */
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {

		List<Movie> list = movieService.findAll();
		for (Movie s : list) {
			System.out.print(s.getImage());
		}

		return "/admin/movie/list";
	}
	
	/**
	 * 添加
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(ModelMap model) {
		model.addAttribute("types", Movie.Type.values());		
		return "/admin/movie/add";
	}
	
	/**
	 * 保存
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Movie movie, RedirectAttributes redirectAttributes) {
      
		
		movieService.save(movie);
         
		addFlashMessage(redirectAttributes, SUCCESS_MESSAGE);
		return "redirect:list.jhtml";
	}

	
	
	

}
