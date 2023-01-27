## High Dominance Pattern Results


----------------------------------------------------------------------------------------------------


### Metadata:
- Dominance Type:             high dominance
- Num. of Coordinates:        1
- Aggregation Method:         sum
- Measurement Column Name:    price
- Coordinate X Column Name:   model

### Detailed Results:
model   price (sum)   Dominance%   Is highlight?   Highlight Type   
Q3      9956610.0     100.0        true            total high       
Q5      2865320.0     87.5         true            partial high     
A3      1897299.0     75.0         true            partial high     
A1      197000.0      62.5         false           -                
A5      94570.0       50.0         false           -                
Q2      56499.0       37.5         false           -                

### Identified Highlights:
- Coordinate: Q3 (model) has an aggregate (sum) value of 9956610 (price)
and a total high dominance of 100% over the aggregate values of the other models.

- Coordinate: Q5 (model) has an aggregate (sum) value of 2865320 (price)
and a partial high dominance of 87.5% over the aggregate values of the other models.

- Coordinate: A3 (model) has an aggregate (sum) value of 1897299 (price)
and a partial high dominance of 75% over the aggregate values of the other models.


----------------------------------------------------------------------------------------------------


### Metadata:
- Dominance Type:             high dominance
- Num. of Coordinates:        1
- Aggregation Method:         sum
- Measurement Column Name:    price
- Coordinate X Column Name:   year

### Detailed Results:
year   price (sum)   Dominance%   Is highlight?   Highlight Type   
2016   5362045.0     100.0        true            total high       
2017   3311070.0     83.333       true            partial high     
2014   2917500.0     66.666       false           -                
2015   2119590.0     50.0         false           -                
2019   1201298.0     33.333       false           -                
2018   207960.0      16.666       false           -                

### Identified Highlights:
- Coordinate: 2016 (year) has an aggregate (sum) value of 5362045 (price)
and a total high dominance of 100% over the aggregate values of the other years.

- Coordinate: 2017 (year) has an aggregate (sum) value of 3311070 (price)
and a partial high dominance of 83.333% over the aggregate values of the other years.


----------------------------------------------------------------------------------------------------


### Metadata:
- Dominance Type:             high dominance
- Num. of Coordinates:        2
- Aggregation Method:         sum
- Measurement Column Name:    price
- Coordinate X Column Name:   model
- Coordinate Y Column Name:   year

### Detailed Results:
model   Dominates the model(s)             for the year(s)                              Dominance%   Is highlight?   Highlight Type   Aggr. Marginal Sum (price)   
Q3      [A1, A3, A4, A5, A6, Q2, Q5, S4]   [2014, 2015, 2016, 2017, 2019]               100.0        true            total high       9956610.0                    
A3      [A1, A4, A5, A6, Q2, S4]           [2013, 2014, 2015, 2016, 2017, 2018, 2019]   75.0         true            partial high     1897299.0                    
Q5      [A1, A3, A4, A6]                   [2015, 2016]                                 50.0         false           -                2865320.0                    
A1      [A4, A6, S4]                       [2016, 2017, 2018, 2014, 2015]               37.5         false           -                197000.0                     
A5      [A4, A6, S4]                       [2017]                                       37.5         false           -                94570.0                      
S4      [A4, A6]                           [2017]                                       25.0         false           -                23700.0                      

### Identified Highlights:
- Coordinate X: Q3 (model) presents a total high dominance over the other models of the dataset.
In detail, the aggregate values of Q3 for the years (Y coordinate): [2014, 2015, 2016, 2017, 2019]
dominate the aggregate values of the models: [A1, A3, A4, A5, A6, Q2, Q5, S4]
Overall, Q3 has a dominance percentage score of 100% and an aggregate marginal sum of 9956610 (price).

- Coordinate X: A3 (model) presents a partial high dominance over the other models of the dataset.
In detail, the aggregate values of A3 for the years (Y coordinate): [2013, 2014, 2015, 2016, 2017, 2018, 2019]
dominate the aggregate values of the models: [A1, A4, A5, A6, Q2, S4]
Overall, A3 has a dominance percentage score of 75% and an aggregate marginal sum of 1897299 (price).


----------------------------------------------------------------------------------------------------


### Metadata:
- Dominance Type:             high dominance
- Num. of Coordinates:        2
- Aggregation Method:         sum
- Measurement Column Name:    price
- Coordinate X Column Name:   year
- Coordinate Y Column Name:   model

### Detailed Results:
year   Dominates the year(s)      for the model(s)           Dominance%   Is highlight?   Highlight Type   Aggr. Marginal Sum (price)   
2016   [2013, 2014, 2018, 2019]   [A1, A3, Q3, A4, A6]       66.666       false           -                5362045.0                    
2017   [2013, 2015, 2018, 2019]   [A1, A3, A5, A6, Q3, A4]   66.666       false           -                3311070.0                    
2014   [2013]                     [A1, A3]                   16.666       false           -                2917500.0                    
2015   [2013]                     [A1, A3]                   16.666       false           -                2119590.0                    
2018   [2013]                     [A1, A3]                   16.666       false           -                207960.0                     
2019   [2013]                     [A3]                       16.666       false           -                1201298.0                    

### Identified Highlights:
No highlights identified.