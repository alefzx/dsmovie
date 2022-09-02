import MovieCard from 'Components/MovieCard';
import Pagination from 'Components/Pagination';

import React from 'react';

const Listing = () => {
    return (
        <>
           <Pagination />
           <div className = "row">
            <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard />
            </div>
         
         
           </div>
          
        </>
    );
};

export default Listing;