CREATE TABLE [dbo].[Book] (
    
	[AuthorFirstName] NVARCHAR (50) NULL,
    [AuthorLastName]  NVARCHAR (50) NULL,
    [Title]           NVARCHAR (50) NULL,
    [BookLanguage]    NVARCHAR (50) NULL,
    [ISBN]            NVARCHAR (50) NULL,
    [Category]        NVARCHAR (50) NULL, 
    [BookID]          INT NOT NULL, 
    CONSTRAINT [PK_Book] PRIMARY KEY ([BookID]) 
);

