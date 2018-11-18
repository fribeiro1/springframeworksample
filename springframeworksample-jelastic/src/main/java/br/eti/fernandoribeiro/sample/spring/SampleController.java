/*
 * Copyright 2012 Fernando Ribeiro
 * 
 * This file is part of Spring Framework Sample.
 *
 * Spring Framework Sample is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * Spring Framework Sample is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with Spring Framework Sample. If not, see <http://www.gnu.org/licenses/>.
 */

package br.eti.fernandoribeiro.sample.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public final class SampleController {

	@RequestMapping("/sendMessage")
	public ModelAndView sendMessage(
			@RequestParam("message") final String message) {
		final ModelAndView modelAndView = new ModelAndView(
				"/WEB-INF/jsp/confirmation.jsp");

		modelAndView.addObject("message", message);

		return modelAndView;
	}

}