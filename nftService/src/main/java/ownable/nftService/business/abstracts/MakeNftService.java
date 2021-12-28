package ownable.nftService.business.abstracts;

import java.util.List;

import ownable.nftService.core.concretes.results.DataResult;
import ownable.nftService.core.concretes.results.Result;
import ownable.nftService.entities.concretes.MakeNFT;

public interface MakeNftService {
	DataResult<List<MakeNFT>> getAll();
	Result insertInto(MakeNFT makeNFT);
}
