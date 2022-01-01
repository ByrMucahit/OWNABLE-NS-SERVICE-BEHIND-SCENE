package ownable.nftService.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ownable.nftService.core.concretes.results.Result;
import ownable.nftService.business.abstracts.MakeNftService;
import ownable.nftService.core.concretes.results.DataResult;
import ownable.nftService.entities.concretes.MakeNFT;

@RestController
@RequestMapping("/api/makeNFTController")
public class makeNFTController {
	
	private MakeNftService makeNFTService;
	
	@Autowired
	public makeNFTController(MakeNftService makeNFTService) {
		super();
		this.makeNFTService = makeNFTService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<MakeNFT>> getAll() {
		return this.makeNFTService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody MakeNFT makeNFT) {
		return this.makeNFTService.insertInto(makeNFT);
	}
	
	@DeleteMapping("/delete")
	public Result delelete(@RequestParam int codeOfAccount) {
		return this.makeNFTService.delete(codeOfAccount);
	}
}
