package com.Hrms.Hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hrms.Hrms.Business.Abstract.ProgrammingLanguageService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programinglanguage")
	public class ProgramLangControllers {
		private ProgrammingLanguageService programmingLanguageService;

		@Autowired
		public ProgramLangControllers(ProgrammingLanguageService programmingLanguageService) {
			super();
			this.programmingLanguageService = programmingLanguageService;
		}
		@RequestMapping("/getall")
		public DataResult<List<ProgrammingLanguage>> getall(){
			return this.programmingLanguageService.getall();
		}
		@PostMapping("/add")
		public Result add(ProgrammingLanguage programmingLanguage) {
			return this.programmingLanguageService.add(programmingLanguage);
		}
}
