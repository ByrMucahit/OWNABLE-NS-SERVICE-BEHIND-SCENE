package ownable.nftService.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ownable.nftService.business.abstracts.MakeNftService;
import ownable.nftService.core.concretes.results.DataResult;
import ownable.nftService.core.concretes.results.Result;
import ownable.nftService.core.concretes.results.SuccessDataResult;
import ownable.nftService.core.concretes.results.SuccessResult;
import ownable.nftService.dataAccess.dao.MakeNFTDao;
import ownable.nftService.entities.concretes.MakeNFT;
@Service
public class MakeNftManager implements MakeNftService {
	
	private MakeNFTDao makeNftDao;
	
	@Autowired
	public MakeNftManager(MakeNFTDao makeNftDao) {
		this.makeNftDao = makeNftDao;
	}

	@Override
	public DataResult<List<MakeNFT>> getAll() {
		return new SuccessDataResult<List<MakeNFT>>
		(this.makeNftDao.findAll(), "Data has been listed");
	}

	@Override
	public Result insertInto(MakeNFT makenNFT) {
		this.makeNftDao.save(makenNFT);
		return new SuccessResult("Product has been added");
	}

	@Override
	public Result delete(int codeOfAccount) {
		makeNftDao.deleteById(codeOfAccount);
		return new SuccessResult("Product has been deleted");
	}

}
